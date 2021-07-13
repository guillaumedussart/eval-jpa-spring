function addToBasket(id) {
	$.ajax({
		url: '/panier/add/' + id,
		type: "get",
		success: function (data) {
			swal({
				title: "Article ajouté",
				text: "You clicked the button!",
				icon: "success",
			});
		}
	})
}

function deleteBasket(id) {
	$.ajax({
		url:'/panier/delete',
		type:"post",
		success(data){
			var modalToggle = document.getElementById('staticBackdrop') // relatedTarget
			modalToggle.hide();
			swal({
				title: "Article ajouté",
				text: "You clicked the button!",
				icon: "success",
			});
		},
		error(data){
			swal({
				title: "Article non ajouté",
				text: "You clicked the button!",
				icon: "danger",
			});
		}

	})
}