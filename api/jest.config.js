module.exports = {
    "testEnvironment": "node",
    "testPathIgnorePatterns": [
        "/node_modules/"
    ],
    "reporters": [
        "default", [
            "./node_modules/jest-html-reporter",
            {
                "pageTitle": "Best Buy Api Tests Report",
                "outputPath": "report/Report.html",
                "includeFailureMsg": true,
                "theme": "lightTheme"
            }
        ]
    ]
};