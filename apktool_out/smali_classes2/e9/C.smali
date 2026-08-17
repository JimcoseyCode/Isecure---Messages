.class public abstract Le9/C;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le9/C$a;
    }
.end annotation


# static fields
.field public static final Companion:Le9/C$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le9/C$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le9/C$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le9/C;->Companion:Le9/C$a;

    .line 8
    .line 9
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

.method public static final create(Le9/x;Ljava/io/File;)Le9/C;
    .locals 1

    .line 1
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    invoke-virtual {v0, p0, p1}, Le9/C$a;->a(Le9/x;Ljava/io/File;)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Le9/x;Ljava/lang/String;)Le9/C;
    .locals 1

    .line 2
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    invoke-virtual {v0, p0, p1}, Le9/C$a;->b(Le9/x;Ljava/lang/String;)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Le9/x;Lt9/k;)Le9/C;
    .locals 1

    .line 3
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    invoke-virtual {v0, p0, p1}, Le9/C$a;->c(Le9/x;Lt9/k;)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Le9/x;[B)Le9/C;
    .locals 7

    .line 4
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v0 .. v6}, Le9/C$a;->i(Le9/C$a;Le9/x;[BIIILjava/lang/Object;)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Le9/x;[BI)Le9/C;
    .locals 7

    .line 5
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v0 .. v6}, Le9/C$a;->i(Le9/C$a;Le9/x;[BIIILjava/lang/Object;)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Le9/x;[BII)Le9/C;
    .locals 1

    .line 6
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    invoke-virtual {v0, p0, p1, p2, p3}, Le9/C$a;->d(Le9/x;[BII)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/io/File;Le9/x;)Le9/C;
    .locals 1

    .line 7
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    invoke-virtual {v0, p0, p1}, Le9/C$a;->e(Ljava/io/File;Le9/x;)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;Le9/x;)Le9/C;
    .locals 1

    .line 8
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    invoke-virtual {v0, p0, p1}, Le9/C$a;->f(Ljava/lang/String;Le9/x;)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lt9/k;Le9/x;)Le9/C;
    .locals 1

    .line 9
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    invoke-virtual {v0, p0, p1}, Le9/C$a;->g(Lt9/k;Le9/x;)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public static final create([B)Le9/C;
    .locals 7

    .line 10
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v6}, Le9/C$a;->k(Le9/C$a;[BLe9/x;IIILjava/lang/Object;)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLe9/x;)Le9/C;
    .locals 7

    .line 11
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v0 .. v6}, Le9/C$a;->k(Le9/C$a;[BLe9/x;IIILjava/lang/Object;)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLe9/x;I)Le9/C;
    .locals 7

    .line 12
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v0 .. v6}, Le9/C$a;->k(Le9/C$a;[BLe9/x;IIILjava/lang/Object;)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLe9/x;II)Le9/C;
    .locals 1

    .line 13
    sget-object v0, Le9/C;->Companion:Le9/C$a;

    invoke-virtual {v0, p0, p1, p2, p3}, Le9/C$a;->h([BLe9/x;II)Le9/C;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract contentLength()J
.end method

.method public abstract contentType()Le9/x;
.end method

.method public isDuplex()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isOneShot()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract writeTo(Lt9/i;)V
.end method
