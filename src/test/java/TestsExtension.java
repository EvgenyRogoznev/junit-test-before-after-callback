import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;


public class TestsExtension implements
        BeforeAllCallback, AfterAllCallback,
        BeforeTestExecutionCallback, AfterTestExecutionCallback {


    @Override
    public void beforeAll(ExtensionContext context) {
        System.out.println("beforeAllTests");
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) {
        System.out.println("beforeTestExecution");
    }

    @Override
    public void afterAll(ExtensionContext context) {
        System.out.println("afterAllTests");
    }

    @Override
    public void afterTestExecution(ExtensionContext context) {
        System.out.println("afterTestExecution");
    }
}


