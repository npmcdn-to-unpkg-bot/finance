angular
    .module('hello', [])
    .controller('home', function($scope, $http) {
        $http.get('/test/')
            .success(function(data) {
                console.log(data);
                $scope.test = data;
            })
    })
;
