async function thisQuestion() {
    fetch("http://localhost:8080/vopros")
        .then(res => res.json())
        .then(data => {
            let index = data.index;
            let value = data.value;

            $('#question-index').text(index);
            $('#question-value').text(value);
        })
}
