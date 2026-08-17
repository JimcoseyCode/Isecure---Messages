.class public final Lr4/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/accounts/Account;

.field private b:Lm0/b;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private final e:LM4/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LM4/a;->p:LM4/a;

    .line 5
    .line 6
    iput-object v0, p0, Lr4/c$a;->e:LM4/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Lr4/c;
    .locals 10

    .line 1
    new-instance v0, Lr4/c;

    .line 2
    .line 3
    iget-object v1, p0, Lr4/c$a;->a:Landroid/accounts/Account;

    .line 4
    .line 5
    iget-object v2, p0, Lr4/c$a;->b:Lm0/b;

    .line 6
    .line 7
    iget-object v6, p0, Lr4/c$a;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v7, p0, Lr4/c$a;->d:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v8, p0, Lr4/c$a;->e:LM4/a;

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-direct/range {v0 .. v9}, Lr4/c;-><init>(Landroid/accounts/Account;Ljava/util/Set;Ljava/util/Map;ILandroid/view/View;Ljava/lang/String;Ljava/lang/String;LM4/a;Z)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public b(Ljava/lang/String;)Lr4/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lr4/c$a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c(Ljava/util/Collection;)Lr4/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/c$a;->b:Lm0/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm0/b;

    .line 6
    .line 7
    invoke-direct {v0}, Lm0/b;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr4/c$a;->b:Lm0/b;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr4/c$a;->b:Lm0/b;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lm0/b;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public final d(Landroid/accounts/Account;)Lr4/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lr4/c$a;->a:Landroid/accounts/Account;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lr4/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lr4/c$a;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
