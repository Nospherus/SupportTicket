'use strict';


angular.module('supportTicketApp')
  .controller('NavbarCtrl', function ($scope, $location, userService) {
	  $scope.isActive = function (viewLocation) { 
	        return viewLocation === $location.path();
	    };
        $scope.brukskontekst = function() {
            return userService.brukskontekst;
        }

        $scope.init = function() {
            userService.hentBrukskontekst();
        };

        $scope.init();
  });
