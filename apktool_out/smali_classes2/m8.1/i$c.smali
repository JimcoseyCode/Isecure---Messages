.class public abstract Lm8/i$c;
.super Lm8/i$b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field private h:Lm8/h;

.field private i:Z


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm8/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lm8/h;->g()Lm8/h;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lm8/i$c;->h:Lm8/h;

    .line 9
    .line 10
    return-void
.end method

.method static synthetic l(Lm8/i$c;)Lm8/h;
    .locals 0

    .line 1
    invoke-direct {p0}, Lm8/i$c;->m()Lm8/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private m()Lm8/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/i$c;->h:Lm8/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm8/h;->q()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lm8/i$c;->i:Z

    .line 8
    .line 9
    iget-object v0, p0, Lm8/i$c;->h:Lm8/h;

    .line 10
    .line 11
    return-object v0
.end method

.method private n()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm8/i$c;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm8/i$c;->h:Lm8/h;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm8/h;->b()Lm8/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lm8/i$c;->h:Lm8/h;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lm8/i$c;->i:Z

    .line 15
    .line 16
    :cond_0
    return-void
.end method


# virtual methods
.method protected final o(Lm8/i$d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm8/i$c;->n()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm8/i$c;->h:Lm8/h;

    .line 5
    .line 6
    invoke-static {p1}, Lm8/i$d;->q(Lm8/i$d;)Lm8/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lm8/h;->r(Lm8/h;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
