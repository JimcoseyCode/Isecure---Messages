.class LO7/h$b;
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
.field final synthetic g:Lk8/f;

.field final synthetic h:LO7/h;


# direct methods
.method constructor <init>(LO7/h;Lk8/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO7/h$b;->h:LO7/h;

    .line 2
    .line 3
    iput-object p2, p0, LO7/h$b;->g:Lk8/f;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()LC8/d0;
    .locals 5

    .line 1
    sget-object v0, LC8/r0;->h:LC8/r0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LC8/r0$a;->j()LC8/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LO7/h$b;->h:LO7/h;

    .line 8
    .line 9
    invoke-virtual {v1}, LO7/h;->j()LC8/v0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 14
    .line 15
    new-instance v3, Lv8/i;

    .line 16
    .line 17
    new-instance v4, LO7/h$b$a;

    .line 18
    .line 19
    invoke-direct {v4, p0}, LO7/h$b$a;-><init>(LO7/h$b;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v3, v4}, Lv8/i;-><init>(Lw7/a;)V

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-static {v0, v1, v2, v4, v3}, LC8/V;->m(LC8/r0;LC8/v0;Ljava/util/List;ZLv8/k;)LC8/d0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/h$b;->a()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
