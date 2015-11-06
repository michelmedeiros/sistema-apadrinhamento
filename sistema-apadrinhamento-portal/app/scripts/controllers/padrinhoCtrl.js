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
    .controller('PadrinhoCtrl', ['$filter', PadrinhoCtrl]);

  function PadrinhoCtrl($filter) {
    var ctrl = this;
    ctrl.model = {};
  }
	
})();

