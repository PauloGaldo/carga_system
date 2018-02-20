(function () {
    'use strict';

    angular
            .module('ng-system-carga')
            .config(config);

    config.$inject = ['$stateProvider', '$locationProvider'];

    function config($stateProvider, $locationProvider) {

        $stateProvider
                .state('main', {
                    url: '/',
                    views: {
                        'body': {
                            templateUrl: '/static/views/main/main.html',
                            controller: 'MainCtrl',
                            controllerAs: 'main'
                        }
                    }
                });

        $locationProvider.html5Mode(true);

    }

})();