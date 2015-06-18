'use strict';


angular.module('supportTicketApp')
  .controller('NavbarCtrl', function ($scope, $location, brukerservice) {
	  $scope.isActive = function (viewLocation) { 
	        return viewLocation === $location.path();
	    };
        $scope.brukskontekst = function() {
            return brukerservice.brukskontekst;
        }

        $scope.init = function() {
            brukerservice.hentBrukskontekst();
        };

        $scope.init();
  });
