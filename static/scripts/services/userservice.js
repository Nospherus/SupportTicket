'use strict';

angular.module('supportTicketApp').service('userService', function($http, $q) {
    var userService = {};
    userService.usercontext = {'userName': "",
                            'roles': []};

    userService.getUsercontext = function() {
        var d = $q.defer();
        $http.get('/api/user/usercontext').then(function(data) {
            userService.usercontext = data.data;
            d.resolve(data)
        }, function(errors) {
            d.reject(errors);
        });
        return d.promise;
    };

    userService.hasRole = function(role) {
        if(role==undefined) {return false;}
        if(jQuery.inArray(role, userService.usercontext.roles) >= 0){
            return true;
        } else {
            return false;
        }
    };
    return userService;
});