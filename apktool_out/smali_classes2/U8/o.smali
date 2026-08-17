.class public abstract LU8/o;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:LW8/E;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LW8/E;

    .line 2
    .line 3
    const-string v1, "NO_VALUE"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LW8/E;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LU8/o;->a:LW8/E;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(LU8/n;Ln7/j;ILT8/a;)LU8/b;
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, -0x3

    .line 4
    if-ne p2, v0, :cond_1

    .line 5
    .line 6
    :cond_0
    sget-object v0, LT8/a;->g:LT8/a;

    .line 7
    .line 8
    if-ne p3, v0, :cond_1

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    new-instance v0, LV8/h;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2, p3}, LV8/h;-><init>(LU8/b;Ln7/j;ILT8/a;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
