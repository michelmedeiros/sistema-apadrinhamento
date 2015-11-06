'use strict';

/**
 * @ngdoc overview
 * @name sistemaApadrinhamentoPortalApp
 * @description
 * # sistemaApadrinhamentoPortalApp
 *
 * Main module of the application.
 */
angular
  .module('sistemaApadrinhamentoPortalApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'ui.utils',
    'ui.mask',
    'ui.select',
    'angularMoment'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
    .when('/padrinhos', {
      templateUrl: 'views/padrinho.html',
      controller: 'PadrinhoCtrl',
      controllerAs: 'ctrl'
    })      
    .otherwise({
        redirectTo: '/'
      });
  });


