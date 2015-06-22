'use strict';

angular.module('supportTicketApp')
    .controller('CheckCtrl', function ($scope, ticketService) {
        $scope.ticket = {
            name: '',
            email: '',
            phone: '',
            location: '',
            description: ''
        };

        $scope.ticketid = '';

        $scope.checkTicket = function() {
            if($scope.ticket != '') {
                ticketService.getTicket($scope.ticketid).then(function(data){
                    $scope.ticket = data.data;
                });
            }
        };
    })
.filter("dateFilter", function () {
    return function (item) {
        if (item != null) {
            return new Date(parseInt(item));
        }
        return "";
    };
});
