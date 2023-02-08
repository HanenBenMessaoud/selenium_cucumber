@authentification
Feature: Authentification sur lapplication SwagLabs
  En tanqt que utilisateur, je souhaite accèder à lapplication

  @login_CasPassant
  Scenario: Authentification valide sur l application SwagLabs-cas passant
    Given Je me connecte sur l application SwagLabs
    When Je remplis le user name "standar_user"
    And Je remplis le pass word "secret_sauce"
    And Je clique sur le buton LOGIN
    Then Je me redirige vers la page home "PRODUCTS"