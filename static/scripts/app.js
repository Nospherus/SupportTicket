'use strict';


angular
  .module('supportTicketApp', [
    'ngRoute'
  ])
  .config(function ($routeProvider, $locationProvider, $httpProvider) {
    $routeProvider
      .when('/', {
        templateUrl: '/scripts/components/home/home.html',
          controller: 'HomeCtrl'
      })
      .when('/register', {
        templateUrl: '/scripts/components/register/register.html',
        controller: 'RegisterCtrl'
      })
        .when('/check', {
          templateUrl: '/scripts/components/check/check.html',
          controller: 'CheckCtrl'
        })
      .when('/about', {
        templateUrl: '/scripts/components/about/about.html',
        controller: 'AboutCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
