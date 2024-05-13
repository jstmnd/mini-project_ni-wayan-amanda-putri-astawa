import BasePage from "./basePage.js";

export default class HomePage extends BasePage {
    constructor(driver) {
        super(driver);
    }

    async getTitle() {
        const titleComponent = await this.find(
            '//android.view.View[@content-desc="Your Groceries"]'
        );

        const title = await titleComponent.getAttribute("content-desc");
        return title;
    }

    async clickCreateIcon() {
        await this.click(
            '//android.widget.Button'
        );
    }

    async getList() {
        const listComponent = await this.find(
            '//android.view.View[@content-desc="Your Groceries"]'
        );

        const list = await listComponent.getAttribute("content-desc");
        return list;
    }
}