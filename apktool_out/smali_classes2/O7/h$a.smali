.class LO7/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/h;-><init>(LB8/n;LL7/m;LM7/h;Lk8/f;LC8/N0;ZILL7/h0;LL7/k0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:LB8/n;

.field final synthetic h:LL7/k0;

.field final synthetic i:LO7/h;


# direct methods
.method constructor <init>(LO7/h;LB8/n;LL7/k0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO7/h$a;->i:LO7/h;

    .line 2
    .line 3
    iput-object p2, p0, LO7/h$a;->g:LB8/n;

    .line 4
    .line 5
    iput-object p3, p0, LO7/h$a;->h:LL7/k0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()LC8/v0;
    .locals 4

    .line 1
    new-instance v0, LO7/h$c;

    .line 2
    .line 3
    iget-object v1, p0, LO7/h$a;->i:LO7/h;

    .line 4
    .line 5
    iget-object v2, p0, LO7/h$a;->g:LB8/n;

    .line 6
    .line 7
    iget-object v3, p0, LO7/h$a;->h:LL7/k0;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, LO7/h$c;-><init>(LO7/h;LB8/n;LL7/k0;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/h$a;->a()LC8/v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
