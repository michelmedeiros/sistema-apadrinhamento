(function() {
  'use strict';

  angular.module('sistemaApadrinhamentoPortalApp').factory('EnumApiService', EnumApiService);

  function EnumApiService() {
    var service = this;

    service.buscarFormaContato = function () {
      return [
      {
        descricao: 'Email',
        valor: '0'
      }, 
      {
        descricao: 'Internet',
        valor: '1'
      },
      {
        descricao: 'TV',
        valor: '2'
      }
      ];
    };

    service.buscarHorarioContato = function () {
      return [
      {
        descricao: 'Manhã',
        valor: '0'
      }, 
      {
        descricao: 'Tarde',
        valor: '1'
      },
      {
        descricao: 'Noite',
        valor: '2'
      }
      ];
    };    

    return {
      buscarFormaContato: service.buscarFormaContato,
      buscarHorarioContato: service.buscarHorarioContato
    };
  }
})();




