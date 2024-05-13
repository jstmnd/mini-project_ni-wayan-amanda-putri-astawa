import { Given, When, Then, Before, After } from "@cucumber/cucumber";
import assert from "assert";

import initDriver from "../../configs/driver.js";
import HomePage from "../../pages/homePage.js";
import AddPage from "../../pages/addItemPage.js";

let driver;
let homePage;
let addPage;

Before({ timeout: 6000 * 10000 }, async () => {
  try {
    driver = await initDriver();
    homePage = new HomePage(driver);
    addPage = new AddPage(driver);
  } catch (error) {
    console.error(error);
  }
});

Given("I am on the home page", async () => {
    const pageTitle = await homePage.getTitle();
    assert.equal(pageTitle, "Your Groceries");
});

When("I click Add New Item icon", async () => {
    await homePage.clickCreateIcon();
});

Then("I input a valid name", async () => {
    const name = "acheron";
    await addPage.insertName(name);
});

Then("I input a valid quantity", async () => {
    const quantity = "1";
    await addPage.insertQuantity(quantity);
});

Then("I click item list", async () => {
    await addPage.tapItemList();
});

Then("I select item that i want to add", async () => {
    await addPage.tapItem();
});

Then("I click Add Item button", async () => {
    await addPage.clickAddItem();
});

Then("I redirected to the home page", async () => {
    const pageTitle = await homePage.getTitle();
    assert.equal(pageTitle, "Your Groceries");
});

Then("I get an error message that the name field must be filled in", async () => {
    const errorNameField = await addPage.getNameErrorMessage();
    assert.equal(errorNameField, "Must be between 1 and 50 characters.");
});

Then("I get an error message that the name quantity must be filled in", async () => {
    const errorQuantityField = await addPage.getQuantityErrorMessage();
    assert.equal(errorQuantityField, "Must be a valid positive number.");
});

Then("I click Reset button", async () => {
    await addPage.clickResetButton();
});

Then("The form was successfully reset", async () => {
    const formReset = await addPage.getFirstState();
    assert.equal(formReset, "Name");
});

When("Item list displayed on the home page", async () => {
    const pageList = await homePage.getList();
    assert.equal(pageList, "Your Groceries");
});

After(async () => {
    await driver.deleteSession();
});