const clock = document.querySelector("#clockBox h2#clock");

function rainBow(num){
    switch (num % 10){
        case 0:
            clock.style("color", "red");
            break;
        case 1:
            clock.style("color", "yellow");
            break;
    }
}

function clockOperation(){

    const date = new Date();
    const hours = String(date.getHours()).padStart(2,"0");
    const minutes = String(date.getMinutes()).padStart(2,"0");
    const seconds = String(date.getSeconds()).padStart(2,"0");

    const time = `${hours}:${minutes}:${seconds}`;

    clock.innerText = time;
}

clockOperation(); //웹사이트 키자마자 시간 사용
setInterval(clockOperation, 1000);