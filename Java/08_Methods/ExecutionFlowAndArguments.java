public class ExecutionFlowAndArguments {

    static void solve() {

        System.out.println("Hey");

        int ans = add(1, 2);

        System.out.println(ans);
        System.out.println("ByyByy");
    }

    static int add(int a, int b) {

        System.out.println("Mullu");

        int ans = a + b;

        return ans;

        // Code after return will not execute
    }

    public static void main(String[] args) {

        System.out.println("Hi");

        solve();

        System.out.println("Bye");
    }
}