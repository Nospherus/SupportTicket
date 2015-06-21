'use strict';

angular.module('supportTicketApp').service('userService', function($http, $q) {
    var userService = {};
    userService.brukskontekst = {'brukerNavn': "",
                            'roller': []};

    userService.hentBrukskontekst = function() {
        var d = $q.defer();
        $http.get('/api/user/usercontext').then(function(data) {
            userService.brukskontekst = data;
            d.resolve(data)
        }, function(errors) {
            d.reject(errors);
        });
        return d.promise;
    };
    return userService;
});