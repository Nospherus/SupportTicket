'use strict';

angular.module('supportTicketApp').service('ticketService', function($http, $q) {
    var ticketService = {};

    ticketService.registerNewTicket = function(newTicketDTO) {
        var d = $q.defer();
        $http.post('/api/ticket/', newTicketDTO).then(function(data) {
            d.resolve(data);
        }, function(errors) {
            d.reject(errors);
        });
        return d.promise;
    };

    ticketService.getTicket = function(id) {
        var d = $q.defer();
        $http.get('/api/ticket/' + id).then(function(data) {
            d.resolve(data);
        }, function(errors) {
            d.reject(errors);
        });
        return d.promise;
    };

    return ticketService;
});