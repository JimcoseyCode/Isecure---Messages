.class final Lc8/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LG8/i;

.field private final b:LU7/E;

.field private final c:LG8/n;


# direct methods
.method public constructor <init>(LG8/i;LU7/E;LG8/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc8/d$a;->a:LG8/i;

    .line 5
    .line 6
    iput-object p2, p0, Lc8/d$a;->b:LU7/E;

    .line 7
    .line 8
    iput-object p3, p0, Lc8/d$a;->c:LG8/n;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()LU7/E;
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/d$a;->b:LU7/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LG8/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/d$a;->a:LG8/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LG8/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/d$a;->c:LG8/n;

    .line 2
    .line 3
    return-object v0
.end method
