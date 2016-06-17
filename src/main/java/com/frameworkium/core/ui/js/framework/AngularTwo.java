package com.frameworkium.core.ui.js.framework;

import com.frameworkium.core.ui.js.AbstractFramework;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class AngularTwo implements AbstractFramework {

    @Override
    public boolean isPresent(JavascriptExecutor javascriptExecutor) {
        return (Boolean) javascriptExecutor.executeScript("return typeof ng == 'object';");
    }

    @Override
    public void waitToBeReady(JavascriptExecutor javascriptExecutor) {
        new NgWebDriver(javascriptExecutor).waitForAngular2RequestsToFinish();
    }
}
