const $main = document.getElementById('main');
const $navItems = Array.from($main.querySelectorAll(':scope > .container > .nav'));
const $nav = document.getElementById('nav');
const $navs = Array.from($nav.querySelectorAll(':scope > .label > .text'));

$navs.forEach(($items) => {
    $items.onclick = () => {
        const $dataId = $items.getAttribute('data-id');
        $navItems.forEach(($item) => {
            $item.classList.add('hidden');
            if ($dataId === $item.getAttribute('data-id')) {
                $item.classList.remove('hidden');
            }
        });
    }
})
