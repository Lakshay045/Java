# Probability Distribution, Correlation and Linear Regression
# ------------------------------------------------------------

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

from scipy import stats
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score

# ------------------------------------------------------------
# STEP 1: Create a sample dataset
# ------------------------------------------------------------

data = {
    "Study_Hours": [2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                    12, 13, 14, 15, 16, 17, 18, 19, 20, 21],

    "Exam_Score": [45, 48, 52, 55, 58, 61, 65, 67, 70, 72,
                   75, 77, 80, 82, 85, 87, 89, 92, 94, 96]
}

df = pd.DataFrame(data)

print("Dataset:")
print(df)

# ------------------------------------------------------------
# STEP 2: Basic statistical analysis
# ------------------------------------------------------------

print("\nDescriptive Statistics:")
print(df.describe())

# Mean
print("\nMean:")
print(df.mean())

# Median
print("\nMedian:")
print(df.median())

# Standard deviation
print("\nStandard Deviation:")
print(df.std())

# Variance
print("\nVariance:")
print(df.var())

# ------------------------------------------------------------
# STEP 3: Probability Distribution Analysis
# ------------------------------------------------------------

# Histogram of Exam Scores
plt.figure(figsize=(8, 5))

sns.histplot(
    df["Exam_Score"],
    bins=8,
    kde=True
)

plt.title("Probability Distribution of Exam Scores")
plt.xlabel("Exam Score")
plt.ylabel("Frequency")
plt.show()

# ------------------------------------------------------------
# STEP 4: Check normality
# ------------------------------------------------------------

statistic, p_value = stats.shapiro(df["Exam_Score"])

print("\nShapiro-Wilk Normality Test")
print("Test Statistic:", statistic)
print("P-value:", p_value)

if p_value > 0.05:
    print("The data approximately follows a normal distribution.")
else:
    print("The data does not follow a normal distribution.")

# ------------------------------------------------------------
# STEP 5: Calculate probability using normal distribution
# ------------------------------------------------------------

mean = df["Exam_Score"].mean()
std = df["Exam_Score"].std()

# Probability that score is less than 80
prob_less_80 = stats.norm.cdf(80, mean, std)

print("\nProbability of Exam Score < 80:")
print(prob_less_80)

# Probability that score is greater than 80
prob_greater_80 = 1 - stats.norm.cdf(80, mean, std)

print("\nProbability of Exam Score > 80:")
print(prob_greater_80)

# ------------------------------------------------------------
# STEP 6: Correlation Analysis
# ------------------------------------------------------------

correlation = df["Study_Hours"].corr(df["Exam_Score"])

print("\nCorrelation between Study Hours and Exam Score:")
print(correlation)

# Complete correlation matrix
print("\nCorrelation Matrix:")
print(df.corr())

# Correlation heatmap
plt.figure(figsize=(7, 5))

sns.heatmap(
    df.corr(),
    annot=True,
    cmap="coolwarm",
    fmt=".2f"
)

plt.title("Correlation Matrix")
plt.show()

# ------------------------------------------------------------
# STEP 7: Scatter plot
# ------------------------------------------------------------

plt.figure(figsize=(8, 5))

sns.scatterplot(
    x="Study_Hours",
    y="Exam_Score",
    data=df
)

plt.title("Study Hours vs Exam Score")
plt.xlabel("Study Hours")
plt.ylabel("Exam Score")
plt.show()

# ------------------------------------------------------------
# STEP 8: Linear Regression
# ------------------------------------------------------------

# Independent variable
X = df[["Study_Hours"]]

# Dependent variable
y = df["Exam_Score"]

# Create regression model
model = LinearRegression()

# Train model
model.fit(X, y)

# Prediction
y_pred = model.predict(X)

# ------------------------------------------------------------
# STEP 9: Regression coefficients
# ------------------------------------------------------------

print("\nLinear Regression Results")

print("Slope (Coefficient):")
print(model.coef_[0])

print("Intercept:")
print(model.intercept_)

print("R-squared:")
print(r2_score(y, y_pred))

# ------------------------------------------------------------
# STEP 10: Calculate error
# ------------------------------------------------------------

mse = mean_squared_error(y, y_pred)
rmse = np.sqrt(mse)

print("\nMean Squared Error:", mse)
print("Root Mean Squared Error:", rmse)

# ------------------------------------------------------------
# STEP 11: Regression equation
# ------------------------------------------------------------

print("\nRegression Equation:")

print(
    "Exam_Score =",
    round(model.intercept_, 2),
    "+",
    round(model.coef_[0], 2),
    "* Study_Hours"
)

# ------------------------------------------------------------
# STEP 12: Plot regression line
# ------------------------------------------------------------

plt.figure(figsize=(8, 5))

plt.scatter(
    df["Study_Hours"],
    df["Exam_Score"],
    label="Actual Data"
)

plt.plot(
    df["Study_Hours"],
    y_pred,
    label="Regression Line"
)

plt.title("Linear Regression: Study Hours vs Exam Score")
plt.xlabel("Study Hours")
plt.ylabel("Exam Score")
plt.legend()

plt.show()

# ------------------------------------------------------------
# STEP 13: Predict score for a new student
# ------------------------------------------------------------

new_student = pd.DataFrame({
    "Study_Hours": [10]
})

predicted_score = model.predict(new_student)

print("\nPredicted score for a student studying 10 hours:")
print(predicted_score[0])
