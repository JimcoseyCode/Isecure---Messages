.class public final Le4/N;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LY3/b;


# instance fields
.field private final a:Ljavax/inject/Provider;

.field private final b:Ljavax/inject/Provider;

.field private final c:Ljavax/inject/Provider;

.field private final d:Ljavax/inject/Provider;

.field private final e:Ljavax/inject/Provider;


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le4/N;->a:Ljavax/inject/Provider;

    .line 5
    .line 6
    iput-object p2, p0, Le4/N;->b:Ljavax/inject/Provider;

    .line 7
    .line 8
    iput-object p3, p0, Le4/N;->c:Ljavax/inject/Provider;

    .line 9
    .line 10
    iput-object p4, p0, Le4/N;->d:Ljavax/inject/Provider;

    .line 11
    .line 12
    iput-object p5, p0, Le4/N;->e:Ljavax/inject/Provider;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Le4/N;
    .locals 6

    .line 1
    new-instance v0, Le4/N;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Le4/N;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static c(Lg4/a;Lg4/a;Ljava/lang/Object;Ljava/lang/Object;Ljavax/inject/Provider;)Le4/M;
    .locals 6

    .line 1
    new-instance v0, Le4/M;

    .line 2
    .line 3
    move-object v3, p2

    .line 4
    check-cast v3, Le4/e;

    .line 5
    .line 6
    move-object v4, p3

    .line 7
    check-cast v4, Le4/U;

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    move-object v5, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Le4/M;-><init>(Lg4/a;Lg4/a;Le4/e;Le4/U;Ljavax/inject/Provider;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method


# virtual methods
.method public b()Le4/M;
    .locals 5

    .line 1
    iget-object v0, p0, Le4/N;->a:Ljavax/inject/Provider;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lg4/a;

    .line 8
    .line 9
    iget-object v1, p0, Le4/N;->b:Ljavax/inject/Provider;

    .line 10
    .line 11
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lg4/a;

    .line 16
    .line 17
    iget-object v2, p0, Le4/N;->c:Ljavax/inject/Provider;

    .line 18
    .line 19
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Le4/N;->d:Ljavax/inject/Provider;

    .line 24
    .line 25
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v4, p0, Le4/N;->e:Ljavax/inject/Provider;

    .line 30
    .line 31
    invoke-static {v0, v1, v2, v3, v4}, Le4/N;->c(Lg4/a;Lg4/a;Ljava/lang/Object;Ljava/lang/Object;Ljavax/inject/Provider;)Le4/M;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le4/N;->b()Le4/M;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
