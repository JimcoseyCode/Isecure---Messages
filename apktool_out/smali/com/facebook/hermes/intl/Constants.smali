.class public Lcom/facebook/hermes/intl/Constants;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final CASEFIRST_FALSE:Ljava/lang/String; = "false"

.field public static final CASEFIRST_LOWER:Ljava/lang/String; = "lower"

.field public static final CASEFIRST_POSSIBLE_VALUES:[Ljava/lang/String;

.field public static final CASEFIRST_UPPER:Ljava/lang/String; = "upper"

.field public static final COLLATION:Ljava/lang/String; = "collation"

.field public static final COLLATION_DEFAULT:Ljava/lang/String; = "default"

.field public static final COLLATION_EXTENSION_KEY_LONG:Ljava/lang/String; = "collation"

.field public static final COLLATION_EXTENSION_KEY_SHORT:Ljava/lang/String; = "co"

.field public static final COLLATION_EXTENSION_PARAM_CASEFIRST_LONG:Ljava/lang/String; = "colCaseFirst"

.field public static final COLLATION_EXTENSION_PARAM_CASEFIRST_SHORT:Ljava/lang/String; = "kf"

.field public static final COLLATION_EXTENSION_PARAM_NUMERIC_LONG:Ljava/lang/String; = "colNumeric"

.field public static final COLLATION_EXTENSION_PARAM_NUMERIC_SHORT:Ljava/lang/String; = "kn"

.field public static final COLLATION_INVALID:Ljava/lang/String; = "invalid"

.field public static final COLLATION_OPTION_CASEFIRST:Ljava/lang/String; = "caseFirst"

.field public static final COLLATION_OPTION_IGNOREPUNCTUATION:Ljava/lang/String; = "ignorePunctuation"

.field public static final COLLATION_OPTION_NUMERIC:Ljava/lang/String; = "numeric"

.field public static final COLLATION_OPTION_SENSITIVITY:Ljava/lang/String; = "sensitivity"

.field public static final COLLATION_OPTION_USAGE:Ljava/lang/String; = "usage"

.field public static final COLLATION_OVERRIDE_TO_DEFAULT_VALUES:[Ljava/lang/String;

.field public static final COLLATION_SEARCH:Ljava/lang/String; = "search"

.field public static final COLLATION_STANDARD:Ljava/lang/String; = "standard"

.field public static final COLLATOR_USAGE_POSSIBLE_VALUES:[Ljava/lang/String;

.field public static final LOCALE:Ljava/lang/String; = "locale"

.field public static final LOCALEMATCHER:Ljava/lang/String; = "localeMatcher"

.field public static final LOCALEMATCHER_BESTFIT:Ljava/lang/String; = "best fit"

.field public static final LOCALEMATCHER_LOOKUP:Ljava/lang/String; = "lookup"

.field public static final LOCALEMATCHER_POSSIBLE_VALUES:[Ljava/lang/String;

.field public static final SEARCH:Ljava/lang/String; = "search"

.field public static final SENSITIVITY_ACCENT:Ljava/lang/String; = "accent"

.field public static final SENSITIVITY_BASE:Ljava/lang/String; = "base"

.field public static final SENSITIVITY_CASE:Ljava/lang/String; = "case"

.field public static final SENSITIVITY_POSSIBLE_VALUES:[Ljava/lang/String;

.field public static final SENSITIVITY_VARIANT:Ljava/lang/String; = "variant"

.field public static final SORT:Ljava/lang/String; = "sort"


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "best fit"

    .line 2
    .line 3
    const-string v1, "lookup"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/facebook/hermes/intl/Constants;->LOCALEMATCHER_POSSIBLE_VALUES:[Ljava/lang/String;

    .line 10
    .line 11
    const-string v0, "standard"

    .line 12
    .line 13
    const-string v1, "invalid"

    .line 14
    .line 15
    const-string v2, "search"

    .line 16
    .line 17
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/facebook/hermes/intl/Constants;->COLLATION_OVERRIDE_TO_DEFAULT_VALUES:[Ljava/lang/String;

    .line 22
    .line 23
    const-string v0, "case"

    .line 24
    .line 25
    const-string v1, "variant"

    .line 26
    .line 27
    const-string v3, "base"

    .line 28
    .line 29
    const-string v4, "accent"

    .line 30
    .line 31
    filled-new-array {v3, v4, v0, v1}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/facebook/hermes/intl/Constants;->SENSITIVITY_POSSIBLE_VALUES:[Ljava/lang/String;

    .line 36
    .line 37
    const-string v0, "lower"

    .line 38
    .line 39
    const-string v1, "false"

    .line 40
    .line 41
    const-string v3, "upper"

    .line 42
    .line 43
    filled-new-array {v3, v0, v1}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lcom/facebook/hermes/intl/Constants;->CASEFIRST_POSSIBLE_VALUES:[Ljava/lang/String;

    .line 48
    .line 49
    const-string v0, "sort"

    .line 50
    .line 51
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/facebook/hermes/intl/Constants;->COLLATOR_USAGE_POSSIBLE_VALUES:[Ljava/lang/String;

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
