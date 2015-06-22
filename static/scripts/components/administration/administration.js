'use strict';

angular.module('supportTicketApp')
    .controller('AdministrationCtrl', function ($scope, ticketService) {
        $scope.tickets = {};
        $scope.ticket = {};

        $scope.getTickets = function() {
            ticketService.getTickets().then(function(data){
                $scope.tickets = data.data;
            });
        };

        $scope.updateTicket = function() {
            if($scope.ticket != {}) {
                ticketService.updateTicket($scope.ticket).then(function(data) {
                    $scope.ticket = data.data;
                });
            }
        };

        $scope.openModal = function(id) {
            ticketService.getTicket(id).then(function(data) {
                $scope.ticket = data.data;
            });
            jQuery('#ticketModal').modal('toggle');
        };

        $scope.disabledClass = function(status) {
            if($scope.ticket.status == status) {
                return 'disabled';
            }
        };

        //Ínit
        $scope.getTickets();
    });