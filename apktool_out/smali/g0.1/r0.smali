.class public abstract Lg0/r0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:Lg0/r0;

.field public static final b:Lg0/r0;

.field public static final c:Lg0/r0;

.field public static final d:Lg0/r0;

.field public static final e:Lg0/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0, v0}, Lg0/r0;->a(III)Lg0/r0;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lg0/r0;->a:Lg0/r0;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x3

    .line 11
    invoke-static {v1, v2, v0}, Lg0/r0;->a(III)Lg0/r0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lg0/r0;->b:Lg0/r0;

    .line 16
    .line 17
    invoke-static {v1, v2, v1}, Lg0/r0;->a(III)Lg0/r0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lg0/r0;->c:Lg0/r0;

    .line 22
    .line 23
    const/4 v0, 0x7

    .line 24
    const/4 v2, 0x6

    .line 25
    invoke-static {v2, v0, v1}, Lg0/r0;->a(III)Lg0/r0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lg0/r0;->d:Lg0/r0;

    .line 30
    .line 31
    invoke-static {v2, v2, v1}, Lg0/r0;->a(III)Lg0/r0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lg0/r0;->e:Lg0/r0;

    .line 36
    .line 37
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(III)Lg0/r0;
    .locals 1

    .line 1
    new-instance v0, Lg0/e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lg0/e;-><init>(III)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c()I
.end method

.method public abstract d()I
.end method
