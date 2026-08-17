.class public final Lp2/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:Lp2/a;

.field public static final b:Ln2/a;

.field public static final c:Ln2/a;

.field public static final d:Ln2/a;

.field public static final e:Ln2/a;

.field public static final f:Ln2/a;

.field public static final g:Ln2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lp2/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lp2/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp2/a;->a:Lp2/a;

    .line 7
    .line 8
    new-instance v0, Ln2/a;

    .line 9
    .line 10
    const-string v1, "Markers for Performance"

    .line 11
    .line 12
    const v2, -0xff0100

    .line 13
    .line 14
    .line 15
    const-string v3, "Performance"

    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2}, Ln2/a;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lp2/a;->b:Ln2/a;

    .line 21
    .line 22
    new-instance v0, Ln2/a;

    .line 23
    .line 24
    const/16 v1, 0x27

    .line 25
    .line 26
    const/16 v2, 0xb0

    .line 27
    .line 28
    const/16 v3, 0x9c

    .line 29
    .line 30
    invoke-static {v3, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const-string v2, "Navigation"

    .line 35
    .line 36
    const-string v3, "Tag for navigation"

    .line 37
    .line 38
    invoke-direct {v0, v2, v3, v1}, Ln2/a;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lp2/a;->c:Ln2/a;

    .line 42
    .line 43
    new-instance v0, Ln2/a;

    .line 44
    .line 45
    const-string v1, "Tag for React Native Core"

    .line 46
    .line 47
    const/high16 v2, -0x1000000

    .line 48
    .line 49
    const-string v3, "RN Core"

    .line 50
    .line 51
    invoke-direct {v0, v3, v1, v2}, Ln2/a;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lp2/a;->d:Ln2/a;

    .line 55
    .line 56
    new-instance v0, Ln2/a;

    .line 57
    .line 58
    const-string v1, "JS to Java calls (warning: this is spammy)"

    .line 59
    .line 60
    const v2, -0xff01

    .line 61
    .line 62
    .line 63
    const-string v3, "Bridge Calls"

    .line 64
    .line 65
    invoke-direct {v0, v3, v1, v2}, Ln2/a;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lp2/a;->e:Ln2/a;

    .line 69
    .line 70
    new-instance v0, Ln2/a;

    .line 71
    .line 72
    const/16 v1, 0x80

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-static {v1, v2, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    const-string v2, "Native Module"

    .line 80
    .line 81
    const-string v3, "Native Module init"

    .line 82
    .line 83
    invoke-direct {v0, v2, v3, v1}, Ln2/a;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    sput-object v0, Lp2/a;->f:Ln2/a;

    .line 87
    .line 88
    new-instance v0, Ln2/a;

    .line 89
    .line 90
    const-string v1, "UI Manager View Operations (requires restart\nwarning: this is spammy)"

    .line 91
    .line 92
    const v2, -0xff0001

    .line 93
    .line 94
    .line 95
    const-string v3, "UI Manager"

    .line 96
    .line 97
    invoke-direct {v0, v3, v1, v2}, Ln2/a;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 98
    .line 99
    .line 100
    sput-object v0, Lp2/a;->g:Ln2/a;

    .line 101
    .line 102
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
