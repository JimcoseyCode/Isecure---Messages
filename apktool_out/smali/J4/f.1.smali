.class public final LJ4/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:I

.field private final b:LJ4/i;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LJ4/i;->g:LJ4/i;

    .line 5
    .line 6
    iput-object v0, p0, LJ4/f;->b:LJ4/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(I)LJ4/f;
    .locals 0

    .line 1
    iput p1, p0, LJ4/f;->a:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()LJ4/j;
    .locals 3

    .line 1
    new-instance v0, LJ4/e;

    .line 2
    .line 3
    iget v1, p0, LJ4/f;->a:I

    .line 4
    .line 5
    iget-object v2, p0, LJ4/f;->b:LJ4/i;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LJ4/e;-><init>(ILJ4/i;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
