/* $(function () {

	 $.ajax({
		  dataType: 'json',
		  method: "GET",
		  url: "/shop/companies/list",
		  success:function(data){
			  $.each(data, function(idx, obj) {
				  $('#companyData tbody').append(
						  "<tr>" +
						  "<td>" +obj.companyName+ "</td>" +
						  "<td>" +obj.location+ "</td>" +
						  "<td>" +obj.createTS+ "</td>" +
						  "<td>" +obj.lastUpdateTS+ "</td>" +
						  "</tr>"
						  )
				});
		  }
		});

	 $( window ).load(function() {
		    $("#companyData").DataTable();
		     $('#example2').DataTable({
		      "paging": true,
		      "lengthChange": false,
		      "searching": false,
		      "ordering": true,
		      "info": true,
		      "autoWidth": false
		    });
		  });

  });*/