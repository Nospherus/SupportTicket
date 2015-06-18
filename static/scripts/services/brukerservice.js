'use strict';

angular.module('supportTicketApp').service('brukerservice', function($http, $q) {
    var brukerService = {};
    brukerService.brukskontekst = {'brukerNavn': "",
                            'roller': []};

    brukerService.hentBrukskontekst = function() {
        var d = $q.defer();
        $http.get('/api/bruker/brukskontekst').then(function(data) {
            brukerService.brukskontekst = data;
            d.resolve(data)
        }, function(errors) {
            d.reject(errors);
        });
        return d.promise;
    };
    return brukerService;
});