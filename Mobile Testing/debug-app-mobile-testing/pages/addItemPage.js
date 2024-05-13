import BasePage from "./basePage.js";

export default class AddPage extends BasePage {
    constructor(driver) {
        super(driver);
    }

    async getPageTittle() {
        const pageTitleComponent = await this.find(
            '//android.view.View[@content-desc="Add a new item"]'
        );

        const pageTitle = await pageTitleComponent.getAttribute("content-desc");
        return pageTitle;
    }

    async insertName(name) {
        const nameContentElement =
          '//android.widget.EditText[@text="Name"]';
    
        await this.click(nameContentElement);
    
        await this.type(nameContentElement, name);
    }

    async insertQuantity(quantity) {
        const quantityContentElement =
          '//android.widget.EditText[@text="1, Quantity"]';
    
        await this.click(quantityContentElement);
    
        await this.type(quantityContentElement, quantity);
    }

    async tapItemList() {
        await this.click('//android.widget.Button[@content-desc="Vegetables"]');
    }

    async tapItem() {
        await this.click('//android.view.View[@content-desc="Meat"]');
    }

    async clickAddItem() {
        await this.click('//android.widget.Button[@content-desc="Add Item"]');
    }

    async getNameErrorMessage() {
        const nameError = await this.find(
            '//android.view.View[@content-desc="Must be between 1 and 50 characters."]'
        );

        const validateNameErrorMessage = await nameError.getAttribute("content-desc");
        return validateNameErrorMessage;
    }

    async getQuantityErrorMessage() {
        const quantityError = await this.find(
            '//android.view.View[@content-desc="Must be a valid positive number."]'
        );

        const validateQuantityErrorMessage = await quantityError.getAttribute("content-desc");
        return validateQuantityErrorMessage;
    }

    async clickResetButton() {
        await this.click('//android.widget.Button[@content-desc="Reset"]');
    }
    
    async getFirstState() {
        const firstStateComponent = await this.find(
            '//android.widget.EditText[@text="Name"]'
        );

        const firstState = await firstStateComponent.getAttribute("text");
        return firstState;
    }
}