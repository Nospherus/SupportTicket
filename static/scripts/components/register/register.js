'use strict';

angular.module('supportTicketApp')
    .controller('RegisterCtrl', function ($scope, ticketService) {
        $scope.ticket = {
            name: '',
            email: '',
            phone: '',
            location: '',
            description: ''
        };

        $scope.ticketId = '';

        $scope.registerNewTicket = function() {
            ticketService.registerNewTicket($scope.ticket).then(function(data){
                $scope.ticketId = data.data.id;
            });
        };
    });
