(function() {
  'use strict';

  angular.module('sistemaApadrinhamentoPortalApp').factory('EnumApiService', EnumApiService);

  function EnumApiService() {
    var service = this;

    service.buscarFormaContato = function () {
      return [
      {
        descricao: 'Email',
        valor: '0',
        classLabel:'label-primary'
      }, 
      {
        descricao: 'Internet',
        valor: '1',
        classLabel:'label-success'
      },
      {
        descricao: 'TV',
        valor: '2',
        classLabel:'label-success'
      }
      ];
    };

    service.buscarHorarioContato = function () {
      return [
      {
        descricao: 'Manhã',
        valor: '0',
        classLabel:'label-primary'
      }, 
      {
        descricao: 'Tarde',
        valor: '1',
        classLabel:'label-success'
      },
      {
        descricao: 'Noite',
        valor: '2',
        classLabel:'label-success'
      }
      ];
    };    

    return {
      buscarFormaContato: service.buscarFormaContato,
      buscarHorarioContato: service.buscarHorarioContato
    };
  }
})();




