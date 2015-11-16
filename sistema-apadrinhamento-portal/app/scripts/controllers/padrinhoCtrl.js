/**
 * @ngdoc function
 * @name sistemaApadrinhamentoPortalApp.controller:PadrinhoCtrl
 * @description
 * # PadrinhoCtrl
 * Controller of the sistemaApadrinhamentoPortalApp
 */
(function() {
  'use strict';

  angular
    .module('sistemaApadrinhamentoPortalApp')
    .controller('PadrinhoCtrl', ['$filter', 'PadrinhoApiService', 'EnumApiService', PadrinhoCtrl]);

  function PadrinhoCtrl($filter, PadrinhoApiService, EnumApiService) {
    var ctrl = this;
    ctrl.model = {};
    ctrl.buscarPadrinhos = buscarPadrinhos;
    ctrl.salvarPadrinho = salvarPadrinho;
		
    init();

    function init() {
    	ctrl.model.padrinho = {};
    	ctrl.model.padrinho.contato = {};
    	ctrl.model.formasContato = {};
    	ctrl.model.horariosContato = {};
    	ctrl.model.formaContatoSelecionado = {};
    	ctrl.model.horarioSelecionado = {};
    	preencherFormaContato();
    	preencherHorarioContato();

    }

    function buscarPadrinhos() {

    	PadrinhoApiService.buscarPadrinhos().success(function(data) {
    		ctrl.model.padrinhos = data;
    	}).error(function (data, status) {
    		ctrl.model.mensagem = 'Erro ao buscar padrinhos ' + data;
    	})
    }

    function salvarPadrinho () {

    	ctrl.model.padrinho.contato.formaContato = ctrl.model.formaContatoSelecionado.valor;
    	ctrl.model.padrinho.contato.horarioContato = ctrl.model.horarioSelecionado.valor;

    	PadrinhoApiService.salvarPadrinho(ctrl.model.padrinho).success(function(data) {
    		ctrl.model.padrinho = data;
    	}).error(function (data, status) {
    		ctrl.model.mensagem = 'Erro ao cadastrar padrinho ' + data;
    	});
    }

    function preencherFormaContato() {
      ctrl.model.formasContato = EnumApiService.buscarFormaContato();
    }

    function preencherHorarioContato() {
    	ctrl.model.horariosContato = EnumApiService.buscarHorarioContato();
    }    
  }
	
})();



