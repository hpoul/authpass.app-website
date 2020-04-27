function init() {
    console.log('init.');

    // Get all "navbar-burger" elements
    const navbarBurgers = document.querySelectorAll('.navbar-burger');

    // Check if there are any navbar burgers
    if (navbarBurgers.length > 0) {

        // Add a click event on each of them
        navbarBurgers.forEach(el => {
            if (!(el instanceof HTMLElement)) {
                console.log('Unknown element', el);
                return;
            }
            el.addEventListener('click', () => {

                // Get the target from the "data-target" attribute
                const target = el.dataset.target;
                if (!target) {
                    console.log('Error: undefined target for element', el);
                    return;
                }
                const $target = document.getElementById(target);

                // Toggle the "is-active" class on both the "navbar-burger" and the "navbar-menu"
                el.classList.toggle('is-active');
                $target?.classList.toggle('is-active');

            });
        });
    }

}

if (document.readyState !== 'loading') {
    init();
} else {
    document.addEventListener('DOMContentLoaded', init);
}

