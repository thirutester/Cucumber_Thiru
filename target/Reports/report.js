$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Tv_purchase.feature");
formatter.feature({
  "name": "Tv Purchase",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Tv"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.scenario({
  "name": "Buy Tv",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Tv"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login by entering crendentials",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_login_by_entering_crendentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search tv",
  "keyword": "When "
});
formatter.match({
  "location": "TvPurchaseSteps.user_search_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the mobile name",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_click_on_the_mobile_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});