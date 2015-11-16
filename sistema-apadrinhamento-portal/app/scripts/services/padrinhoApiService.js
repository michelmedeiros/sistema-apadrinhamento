(function() {
  'use strict';

  angular.module('sistemaApadrinhamentoPortalApp').factory('PadrinhoApiService', ['$http', PadrinhoApiService]);

  function PadrinhoApiService($http) {
    var service = this;
    var BUSCAR_PADRINHOS = 'http://localhost:8080/sistema-apadrinhamento-ws/rs/padrinho/buscarPadrinhos';
    var SALVAR_PADRINHO = 'http://localhost:8080/sistema-apadrinhamento-ws/rs/padrinho/salvarPadrinho';
    service.buscarPadrinhos = function() {
      return $http.get(BUSCAR_PADRINHOS);
    };

    service.salvarPadrinho = function(data) {
      return $http.post(SALVAR_PADRINHO, data);
    };

    return {
      buscarPadrinhos: service.buscarPadrinhos,
      salvarPadrinho: service.salvarPadrinho
    };
  }
})();
