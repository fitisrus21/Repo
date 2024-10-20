interface TestScenario {
    void runTest();
}

class LoginTest implements TestScenario {
    @Override

    public void runTest() {
        System.out.println("start login test ...");
    }

}

class PaymentTest implements TestScenario {
    @Override
    public void runTest() {
        System.out.println("start payment test...");
    }
}

class ProductSearchTest implements TestScenario {

    @Override
    public void runTest() {
        System.out.println("Start test ProductSearch...");
    }
}

class TestAutomationSystem {
    public static void main(String[] args) {
        TestScenario[] testScenarios = new TestScenario[3];
        testScenarios[0] = new LoginTest();
        testScenarios[2] = new ProductSearchTest();
        testScenarios[1] = new PaymentTest();

        for (TestScenario ts:testScenarios
        ) {
            ts.runTest();
        }
    }
}

