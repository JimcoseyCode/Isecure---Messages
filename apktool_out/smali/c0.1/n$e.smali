.class final enum Lc0/n$e;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "e"
.end annotation


# static fields
.field public static final enum g:Lc0/n$e;

.field public static final enum h:Lc0/n$e;

.field public static final enum i:Lc0/n$e;

.field private static final synthetic j:[Lc0/n$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lc0/n$e;

    .line 2
    .line 3
    const-string v1, "CONFIGURED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lc0/n$e;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lc0/n$e;->g:Lc0/n$e;

    .line 10
    .line 11
    new-instance v0, Lc0/n$e;

    .line 12
    .line 13
    const-string v1, "STARTED"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lc0/n$e;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lc0/n$e;->h:Lc0/n$e;

    .line 20
    .line 21
    new-instance v0, Lc0/n$e;

    .line 22
    .line 23
    const-string v1, "RELEASED"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lc0/n$e;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lc0/n$e;->i:Lc0/n$e;

    .line 30
    .line 31
    invoke-static {}, Lc0/n$e;->h()[Lc0/n$e;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lc0/n$e;->j:[Lc0/n$e;

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

.method private static synthetic h()[Lc0/n$e;
    .locals 3

    .line 1
    sget-object v0, Lc0/n$e;->g:Lc0/n$e;

    .line 2
    .line 3
    sget-object v1, Lc0/n$e;->h:Lc0/n$e;

    .line 4
    .line 5
    sget-object v2, Lc0/n$e;->i:Lc0/n$e;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lc0/n$e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lc0/n$e;
    .locals 1

    .line 1
    const-class v0, Lc0/n$e;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lc0/n$e;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lc0/n$e;
    .locals 1

    .line 1
    sget-object v0, Lc0/n$e;->j:[Lc0/n$e;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lc0/n$e;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lc0/n$e;

    .line 8
    .line 9
    return-object v0
.end method
