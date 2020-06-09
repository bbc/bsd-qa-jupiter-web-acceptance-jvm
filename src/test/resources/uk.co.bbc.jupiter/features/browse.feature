@browse
Feature: Browse

  Background:
    Given I navigate to Jupiter Web Homepage

  @smoke @automated
  Scenario: Default View
    Then The 50 most recent clips from all sites are displayed in grid view by default
    And Clip count should be displayed