const url = 'https://www.kabum.com.br/';
const url1 = 'https://www.pichau.com.br/';
const url2 = 'https://www.terabyteshop.com.br/';
const url3 = 'https://www.studiopc.com.br/';
const btn = document.querySelector('#btn');

function openInNewTab1(url){
    const win = window.open(url, '_blank');
    win.focus();
}

function openInNewTab(url1){
    const win = window.open(url1, '_blank');
    win.focus()
};

function openInNewTab(url2){
    const win = window.open(url2, '_blank');
    win.focus();
}

function openInNewTab(url3){
    const win = window.open(url3, '_blank');
    win.focus();
}

btn.addEventListener('click', () => {
    openInNewTab(url);
})
    
btn1.addEventListener('click', () => {
    openInNewTab(url1);
})
    
    
btn2.addEventListener('click', () => {
    openInNewTab(url2);
})

btn3.addEventListener('click', () => {
    openInNewTab(url3)
})