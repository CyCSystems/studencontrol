/**
 * 
 */

$(document).ready(function() {
	$('#documents').DataTable({
		responsive : true,
		'createdRow': function( row, data, dataIndex ) {
		      $(row).attr('id', dataIndex);
		  },
		  'columnDefs': [
		     {
		        'targets': 0,
		        'createdCell':  function (td, cellData, rowData, row, col) {
        				$(td).attr('style','display:none');
		        }
		     }
		  ]
	});
	
	$("#tblModificar").click(function(){
		alert ($(this).parent().parent().attr("id"));
    });
});

function addStudentDocument() {
	var documentTypeValue = $("#DocumentType").val();
	var documentTypeText = $("#DocumentType option:selected").text();
	var document = $("#Document").val();
	var receptionDate = $("#ReceptionDate").val();

	console.log("Valor del Tipo de Documento" + documentTypeValue);
	console.log("Texto del tipo de documento" + documentTypeText);
	console.log("Documento" + document);
	console.log("Fecha de recepcion" + receptionDate);

	var table = $('#documents').DataTable();
	table.row.add(
					[
						documentTypeValue,
						documentTypeText,
						document,
						receptionDate,
						"<div class='col-lg-3'><button type='button' class='btn btn-warning' data-toggle='modal' onClick='alert ($(this).parent().parent().attr(\"id\"));' data-target='#editDocument'>Editar</button></div><div class='col-lg-3'><button type='button' class='btn btn-danger'>Eliminar</button></div></td>"
					]
				)
			.draw(false);

	$("#DocumentType").val('1');
	$("#Document").val('');
	$("#ReceptionDate").val(null);
}

function editStudentDocument(id){
	
}