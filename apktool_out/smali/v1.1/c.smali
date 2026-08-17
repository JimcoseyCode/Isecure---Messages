.class public final enum Lv1/c;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final enum g:Lv1/c;

.field public static final enum h:Lv1/c;

.field public static final enum i:Lv1/c;

.field private static final synthetic j:[Lv1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lv1/c;

    .line 2
    .line 3
    const-string v1, "SOURCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lv1/c;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lv1/c;->g:Lv1/c;

    .line 10
    .line 11
    new-instance v0, Lv1/c;

    .line 12
    .line 13
    const-string v1, "TRANSFORMED"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lv1/c;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lv1/c;->h:Lv1/c;

    .line 20
    .line 21
    new-instance v0, Lv1/c;

    .line 22
    .line 23
    const-string v1, "NONE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lv1/c;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lv1/c;->i:Lv1/c;

    .line 30
    .line 31
    invoke-static {}, Lv1/c;->h()[Lv1/c;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lv1/c;->j:[Lv1/c;

    .line 36
    .line 37
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic h()[Lv1/c;
    .locals 3

    .line 1
    sget-object v0, Lv1/c;->g:Lv1/c;

    .line 2
    .line 3
    sget-object v1, Lv1/c;->h:Lv1/c;

    .line 4
    .line 5
    sget-object v2, Lv1/c;->i:Lv1/c;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lv1/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lv1/c;
    .locals 1

    .line 1
    const-class v0, Lv1/c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv1/c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lv1/c;
    .locals 1

    .line 1
    sget-object v0, Lv1/c;->j:[Lv1/c;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lv1/c;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lv1/c;

    .line 8
    .line 9
    return-object v0
.end method
