'use strict';


angular.module('supportTicketApp')
  .controller('NavbarCtrl', function ($scope, $location, userService) {
	  $scope.isActive = function (viewLocation) { 
	        return viewLocation === $location.path();
	    };
        $scope.usercontext = function() {
            return userService.usercontext;
        };

        $scope.hasRole = function(role) {
            return userService.hasRole(role);
        };

        $scope.init = function() {
            userService.getUsercontext();
        };

        $scope.init();
  });
