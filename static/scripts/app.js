'use strict';


angular
  .module('supportTicketApp', [
    'ngRoute'
  ])
  .config(function ($routeProvider, $locationProvider, $httpProvider) {
    $routeProvider
      .when('/', {
        templateUrl: '/scripts/components/welcome/welcome.html',
      })
      .when('/om', {
        templateUrl: '/scripts/components/om/om.html',
        controller: 'OmCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
